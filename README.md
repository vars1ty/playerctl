# PlayerCTL
## What is it?
A wrapper around PlayerCTL for GNU/Linux-based operating systems, offering a set of various, easy-to-use and understand functions.
## Usage
```java
private final PlayerCTL PLAYERCTL = new PlayerCTL();

/**
 * Startup function.
 */
public static void main(String... args) {
    System.out.printf("You are currently listening to: %s", PLAYERCTL.getTitle());
}
```