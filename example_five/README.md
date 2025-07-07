# 🎮 Spring Boot Game Example

This project demonstrates how to use Spring Boot's core features like `@Configuration`, `@Bean`, and `ApplicationContext` to manage game objects (`SuperContraGame` and `GameRunner`).

---

## 🧩 Option 1: Using Two Separate Classes

We can define Spring beans and run the application using two separate classes:

### 📁 `GameConfiguration.java`

```java
package com.example.example_five.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.example_five.game.GameRunner;
import com.example.example_five.game.SuperContraGame;

@Configuration
public class GameConfiguration
{
    @Bean
    public SuperContraGame game()
    {
        return new SuperContraGame();
    }

    @Bean
    public GameRunner gamerunner()
    {
        // re-using 'game()' bean
        return new GameRunner(game());
    }
}
```

✅ This class tells Spring how to **create and wire beans** manually using `@Bean` methods.

---

### 📁 `SpringBootRun.java`

```java
package com.example.example_five.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.example_five.game.GameRunner;
import com.example.example_five.game.SuperContraGame;

public class SpringBootRun {

    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(GameConfiguration.class);

        context.getBean(SuperContraGame.class).up();

        context.getBean(GameRunner.class).run();
    }
}
```

✅ This is your **entry point**. It loads the Spring context and retrieves the `SuperContraGame` and `GameRunner` beans to run the game.

---

## 🧩 Option 2: Using a Single Class for Simplicity

Instead of writing two separate classes (`GameConfiguration` and `SpringBootRun`), you can combine both into one class like below:

### 📁 `SpringBootRun.java` (All-in-One)

```java
package com.example.example_five.inone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.example_five.game.GameRunner;
import com.example.example_five.game.SuperContraGame;

// Instead of writing 2 individual classes, everything is inside 1 class
@Configuration
public class SpringBootRun
{
    @Bean
    public SuperContraGame game()
    {
        return new SuperContraGame();
    }

    @Bean
    public GameRunner gameRunner()
    {
        return new GameRunner(game());
    }

    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(SpringBootRun.class);

        context.getBean(GameRunner.class).run();
    }
}
```

✅ This approach is helpful for small projects or when you want to keep the configuration and application runner together.

---

## 🧩 Option 3: Fully Automated Spring Configuration using Annotations

In this version, **everything is automated** using annotations like `@Component`, `@ComponentScan`, and `@Primary`. Spring automatically scans, configures, and wires the beans.

### 📁 `SpringAuto.java`

```java
package com.example.example_five.springauto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.example_five.springauto.regame.GameRunner;
import com.example.example_five.springauto.regame.SuperContraGame;

// In this example Spring will create Configuration, Annotation, Beans, Object Wiring, etc. automatically.
//
// Note 1 : All your classes must be annotated with @Component.
// Note 2 : The container class must be annotated with @Configuration.
// Note 3 : To discover components, use @ComponentScan with the base package.
// Note 4 : You can use @Primary to prioritize a bean when multiple implementations exist.

@Configuration
@ComponentScan("com.example.example_five.springauto.regame")
public class SpringAuto 
{
    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(SpringAuto.class);

        context.getBean(SuperContraGame.class).up();

        context.getBean(GameRunner.class).run();
    }
}
```

✅ This is the most **Spring Boot-friendly** way of working — minimal configuration, maximum automation.

---

## 🧠 How It Works – Bean Wiring

Here’s a visual to understand the dependency injection:

```
+--------------------+             +-----------------------+
|  SuperContraGame   |<------------|     GameRunner        |
+--------------------+             +-----------------------+
         ^                                   ^
         |                                   |
         |  @Bean / @Component methods in    |
         +------------ Configuration --------+
```

---

## 🗂 Project Structure

```
src/
└── com/example/example_five/
    ├── game/
    │   ├── SuperContraGame.java
    │   └── GameRunner.java
    ├── springboot/
    │   ├── GameConfiguration.java
    │   └── SpringBootRun.java
    ├── inone/
    │   └── SpringBootRun.java
    └── springauto/
        ├── SpringAuto.java
        └── regame/
            ├── SuperContraGame.java
            └── GameRunner.java
```

---

## 💡 Summary

* **@Configuration** marks a class that defines Spring beans.
* **@Bean** manually creates and wires components.
* **@ComponentScan** automates detection and wiring.
* **@Primary** prioritizes beans in case of multiple implementations.
* You can use Spring in 3 ways: manual beans, all-in-one class, or fully automated.

---
