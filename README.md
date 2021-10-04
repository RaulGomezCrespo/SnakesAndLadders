# SnakesAndLadders

A solution to the problem "SnakesAndLadders" for the Voxel recruiting process. It consists on a Java 1.8 console application, with uses Gradle 6.9.1 for building and JUnit 5 for testing.

## Setup

    git clone https://github.com/RaulGomezCrespo/SnakesAndLadders.git

## Requirements

	- Java 1.8
	- Gradle 6.9.1	

## Running

Run the 'SnakesAndLadders' class for start application.

## Running Tests

Run the tests from the IDE you are using.
This application has 2 test classes:
- DiceTest
- SnakesAndLaddersTest

## Architecture

The main entry point of the application is the 'SnakesAndLadders' class.

## Assumptions

In the test referring to UAT2 of US3, you have to use the result of the dice, that is, call the roll () method. After checking that in the cases in which the result of the dice is 4, the piece moves 4 spaces. The problem I saw was that the result of rolling the dice is random, therefore sometimes it will fail and others not, thus deducing that it is not correct because the test must always be green or red. So I decided to hardcode the result after trying the roll () method call, avoiding the problem.