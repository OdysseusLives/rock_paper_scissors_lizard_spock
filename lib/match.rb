class Match
  def initialize aggressor, defender
    @aggressor = aggressor
    @defender = defender
    @@weapons = { 'rock' => 1, 'paper' => 2, 'scissors' => 3 }
  end

  def winning_move
    aggressor_wins? ? @aggressor : @defender
  end

  def aggressor_wins?
    aggressor_value = @@weapons[@aggressor]
    defender_value = @@weapons[@defender]

    if weapons_loop_around
      is_at_beginning?(@aggressor) ? aggressor_value+= @@weapons.count : defender_value+= @@weapons.count
    end

    aggressor_value > defender_value
  end


  private

  def weapons_loop_around
    (is_at_end?(@aggressor) or is_at_end?(@defender)) and (is_at_beginning?(@aggressor) or is_at_beginning?(@defender))
    end

  def is_at_beginning? weapon
    @@weapons[weapon] == 1
  end

  def is_at_end? weapon
    @@weapons[weapon] == @@weapons.count
  end
end