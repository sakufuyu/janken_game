# Janken Game with Anime Character

A fun Rock-Paper-Scissors game where you can play against a cute anime character using Java Swing.

## Test Play Video
[https://d2wm9ivq8if9lh.cloudfront.net/janken_game_test_play.html]

## Features

- Simple and intuitive GUI interface
- Play Rock-Paper-Scissors against computer
- Animated character responses
- Instant result display
- Option to play multiple rounds

## Requirements

- Java 8 or higher
- Java Runtime Environment (JRE)

## Installation

1. Clone this repository:
```bash
git clone [repository-url]
```

2. Navigate to the project directory:
```bash
cd JankenGame
```

3. Compile the Java files:
```bash
javac -d bin src/*.java
```

4. Run the game:
```bash
java -cp bin App
```

## How to Play

1. Launch the game
2. Click one of three buttons (Rock, Paper, or Scissors)
3. The computer will randomly choose its hand
4. The result will be displayed at the top of the window
5. Click "Next Game..!" to play another round

## Project Structure

```
JankenGame/
├── src/               # Source files
│   ├── App.java      # Main application class
│   ├── ComputerHand.java
│   ├── FrameMaker.java
│   ├── GameJudge.java
│   ├── GameStart.java
│   ├── GetImageIcon.java
│   ├── PanelMaker.java
│   ├── TextMaker.java
│   └── images/       # Game images
├── bin/              # Compiled class files
└── lib/              # External libraries
```

## Development

- Built using Java Swing for GUI
- Implements MVC architecture pattern
- Modular design for easy maintenance and updates
