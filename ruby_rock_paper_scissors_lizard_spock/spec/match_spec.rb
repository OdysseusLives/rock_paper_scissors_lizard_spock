require 'helper'

describe Match do
  ROCK = 'rock'
  PAPER = 'paper'
  SCISSORS = 'scissors'
  LIZARD = 'lizard'
  SPOCK = 'spock'
  STALEMATE = 'stalemate'

  describe 'winning_move' do
      it 'returns weapon name' do
        winning_move = Match.new(SCISSORS, PAPER).winning_move
        expect(winning_move).to eql(SCISSORS)
      end

      it 'lets aggressor win' do
        expect(Match.new(SCISSORS, PAPER).winning_move).to eql(SCISSORS)
      end

      it 'lets defender win' do
        expect(Match.new(PAPER, SCISSORS).winning_move).to eql(SCISSORS)
      end

      it 'uses the maximum number of weapons decide winner' do
        expect(Match.new(SPOCK, SCISSORS).winning_move).to eql(SPOCK)
      end

      it 'knows when a stalemate is reached' do
        expect(Match.new(SCISSORS, SCISSORS).winning_move).to eql(STALEMATE)
      end
    end

    context 'scissors' do
      it 'defeats paper' do
        expect(Match.new(SCISSORS, PAPER).winning_move).to eql(SCISSORS)
      end

      it 'is defeated by rock' do
        expect(Match.new(SCISSORS, ROCK).winning_move).to eql(ROCK)
      end

      it 'defeats lizard' do
        expect(Match.new(SCISSORS, LIZARD).winning_move).to eql(SCISSORS)
      end

      it 'is defeated by spock' do
        expect(Match.new(SCISSORS, SPOCK).winning_move).to eql(SPOCK)
      end
    end
end