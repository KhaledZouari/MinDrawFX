# MiniDrawFX Professional

[![CI](https://github.com/KhaledZouari/minidrawfx/actions/workflows/ci.yml/badge.svg)](https://github.com/KhaledZouari/minidrawfx/actions/workflows/ci.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-2ea44f.svg)](LICENSE)

A JavaFX vector drawing application designed around established design patterns
and multiple persistence strategies.

## Features

- Create, select, move, resize, style, and delete vector shapes
- Undo and redo through the Command pattern
- Save drawings as JSON, binary files, or SQLite data
- Export drawings as PNG
- Keyboard shortcuts and a structured desktop interface

## Stack

Java 21, JavaFX 21, FXML, CSS, SQLite JDBC, Maven, and JUnit 5.

## Architecture

The codebase applies Factory, Command, Observer, Strategy, Decorator, Adapter,
and Singleton patterns. Each responsibility lives in a dedicated package.

## Run locally

Prerequisites: JDK 21 and Maven 3.9.

A self-contained Windows build is available under
[Releases](https://github.com/KhaledZouari/minidrawfx/releases).

```bash
git clone https://github.com/KhaledZouari/minidrawfx.git
cd minidrawfx
mvn verify
mvn javafx:run
```

Maven resolves JavaFX and SQLite dependencies; no local SDK path is required.

## Configuration and persistence

No environment variables are required. The application creates `mindraw.db`
locally at runtime, and the database remains excluded from Git.

## Quality

```bash
mvn verify
```

JUnit tests cover the central shape collection. GitHub Actions builds and tests
the application on pushes and pull requests targeting `main`.

## Known limitations

- Advanced vector operations are outside the current scope.
- Additional UI and persistence integration tests would improve coverage.

## License

Distributed under the MIT License. See [LICENSE](LICENSE).

