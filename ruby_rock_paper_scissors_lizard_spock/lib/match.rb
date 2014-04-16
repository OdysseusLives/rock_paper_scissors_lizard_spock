class Match
  def initialize aggressor, defender
    @aggressor = aggressor
    @defender = defender
    @@weapons = { 'scissors' => 1, 'paper' => 2, 'rock' => 3, 'lizard' => 4, 'spock' => 5 }
  end

  def winning_move
    return 'stalemate' if same_weapon?
    aggressor_wins? ? @aggressor : @defender
  end


  private

  def aggressor_wins?
    aggressor = @@weapons[@aggressor]
    defender = @@weapons[@defender]
    difference = aggressor - defender

    matches_aggressor_pattern?(difference) ? true : false
  end

  def matches_aggressor_pattern?(difference)
    (difference < 0 && difference % 2 == 1) or (difference > 0 && difference % 2 == 0)
  end

  def same_weapon?
    @aggressor == @defender
  end
end