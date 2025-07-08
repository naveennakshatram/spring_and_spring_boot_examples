# Spring Constructor-Based Dependency Injection Example

This is a simple Spring application demonstrating **constructor-based dependency injection** using `@Autowired`, `@Component`, `@Configuration`, and `@ComponentScan`.

## 🧠 Concepts Covered

- Spring IoC Container
- Constructor Injection
- Annotation-based Configuration
- Bean Scanning with `@ComponentScan`

## 📁 Package Structure

```
com.example.example_six.depen.injection.three
│
├── ConstructorBasedInjection.java   # Main configuration and entry point
├── Student.java                     # Dependent class
├── Marks.java                       # Dependency class 1
└── Percentage.java                  # Dependency class 2
```

## 🔍 How It Works

- `Student` class has dependencies on `Marks` and `Percentage`.
- Spring scans and registers all `@Component` classes.
- The `@Autowired` constructor in `Student` lets Spring inject the required dependencies.
- The `main` method initializes the context, prints all beans, and shows the injected `Student` bean.

## ▶️ Output

```plaintext
constructorBasedInjection
marks
percentage
student
...
Marks : com.example.example_six.depen.injection.three.Marks@6d03e736
Percent : com.example.example_six.depen.injection.three.Percentage@568db2f2
```

## 📦 How to Run

1. Make sure you have Java and Maven/Gradle setup.
2. Include Spring Core and Context dependencies in your project.
3. Run `ConstructorBasedInjection.java` as a Java application.

## 📚 Dependencies

If you're using Maven, include:

```xml
<dependency>
  <groupId>org.springframework</groupId>
  <artifactId>spring-context</artifactId>
  <version>6.1.5</version> <!-- Use latest compatible version -->
</dependency>
```

## ✅ Key Annotations

| Annotation         | Purpose                             |
|--------------------|--------------------------------------|
| `@Component`       | Marks a class as a Spring bean       |
| `@Autowired`       | Automatically injects dependencies   |
| `@Configuration`   | Configuration class for Spring       |
| `@ComponentScan`   | Tells Spring where to scan for beans |

