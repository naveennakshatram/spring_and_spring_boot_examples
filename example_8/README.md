# 🎯 Spring Bean Scope: Singleton vs Prototype

This example demonstrates the difference between Spring's **Singleton** and **Prototype** bean scopes using a simple Java application.

---

## 🧪 Code Example: `SingleAndPrototypeExample.java`

```java
package com.example.example_eight;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class Student {
    // Singleton by default
}

@Component
@Scope("prototype")
class Marks {
    // Prototype bean
}

@Configuration
@ComponentScan
public class SingleAndPrototypeExample {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SingleAndPrototypeExample.class);

        // Singleton Beans - All will print the same reference
        System.out.println(context.getBean(Student.class));
        System.out.println(context.getBean(Student.class));
        System.out.println(context.getBean(Student.class));
        System.out.println(context.getBean(Student.class));
        System.out.println(context.getBean(Student.class));

        // Prototype Beans - Each will print a different reference
        System.out.println(context.getBean(Marks.class));
        System.out.println(context.getBean(Marks.class));
        System.out.println(context.getBean(Marks.class));
        System.out.println(context.getBean(Marks.class));
        System.out.println(context.getBean(Marks.class));
    }
}
```

---

## 🧠 What You’ll Observe

### ✅ Singleton Scope (Default)

* The `Student` class is not annotated with any scope.
* Spring treats it as a **singleton bean by default**.
* Only **one object** is created and shared for every `getBean()` call.

### 🔁 Prototype Scope

* The `Marks` class is explicitly annotated with `@Scope("prototype")`.
* Spring creates a **new object every time** `getBean()` is called.

---

## 📌 Output Snapshot (Example)

```
com.example.example_eight.Student@1a2b3c4d
com.example.example_eight.Student@1a2b3c4d
com.example.example_eight.Student@1a2b3c4d
com.example.example_eight.Student@1a2b3c4d
com.example.example_eight.Student@1a2b3c4d

com.example.example_eight.Marks@7a8b9c0d
com.example.example_eight.Marks@6b7c8d9e
com.example.example_eight.Marks@5c6d7e8f
com.example.example_eight.Marks@4d5e6f7g
com.example.example_eight.Marks@3e4f5g6h
```

✅ All `Student` objects have the same reference.
✅ All `Marks` objects have different references.

---

## 📚 What Is Bean Scope?

Bean scope defines how Spring manages the lifecycle and visibility of a bean.

| Scope       | Description                                       |
| ----------- | ------------------------------------------------- |
| `singleton` | One shared instance per Spring container          |
| `prototype` | New instance every time requested via `getBean()` |

---

## 🧠 Real-world Use Cases

### Singleton:

* Stateless services like `UserService`, `EmailService`
* Utility or helper classes
* DAO or Repository classes

### Prototype:

* Objects that need to maintain different internal states
* Temporary or per-request objects
* Custom data model instances used briefly

---

## 🗂 Project Structure

```
src/
└── com/example/example_eight/
    ├── Student.java
    ├── Marks.java
    └── SingleAndPrototypeExample.java
```

---

## 📝 Summary

* Singleton beans are shared and reused — good for services.
* Prototype beans are created fresh each time — good for dynamic or temporary objects.
* Spring makes it easy to manage both using annotations.

---

## 📘 Learn More

* [Spring Bean Scopes Official Docs](https://docs.spring.io/spring-framework/reference/core/beans/factory-scopes.html)
* [Baeldung: Spring Bean Scopes](https://www.baeldung.com/spring-bean-scopes)

---
