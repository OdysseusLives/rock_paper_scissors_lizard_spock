require 'helper'

describe Match do
  ROCK = 'rock'
  PAPER = 'paper'
  SCISSORS = 'scissors'

  describe 'winning_move' do
    context 'specific weapons' do
      it 'scissors should beat paper' do
        winning_move = Match.new(SCISSORS, PAPER).winning_move()
        expect(winning_move).to eql(SCISSORS)
      end
    end
  end

  describe 'aggressor_wins?' do
    it 'lets greater number win' do
      expect(Match.new(SCISSORS, PAPER).aggressor_wins?).to be_true
    end

    it 'does not let lesser number win' do
      expect(Match.new(PAPER, SCISSORS).aggressor_wins?).to be_false
    end

    it 'uses the maximum number of weapons to let winning wrap around' do
      expect(Match.new(ROCK, SCISSORS).aggressor_wins?).to be_true
    end
  end
end