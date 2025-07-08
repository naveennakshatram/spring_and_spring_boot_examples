# 📌 Spring Bean Lifecycle: `@PostConstruct` and `@PreDestroy`

This example demonstrates how to use `@PostConstruct` and `@PreDestroy` annotations in Spring to handle initialization and cleanup logic automatically.

---

## 🧪 Code Example: `PostConstructPreDestroy.java`

```java
package com.example.example_9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class Student {
    Marks marks;

    public Student(Marks marks) {
        System.out.println("Student Component Constructor....!");
        this.marks = marks;
        System.out.println("Object initialization is finished....");
    }

    // Called after constructor and dependency injection
    @PostConstruct
    public void displayMarks() {
        System.out.println(marks.total());
    }

    // Called when the Spring context is closing
    @PreDestroy
    public void cleanup() {
        System.out.println("Cleanup");
    }
}

@Component
class Marks {
    public int total() {
        return 456;
    }
}

@Configuration
@ComponentScan
public class PostConstructPreDestroy {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(PostConstructPreDestroy.class);

        context.close(); // <--- This will trigger the @PreDestroy
    }
}
```

---

## 🔄 Lifecycle Flow

```
Constructor ➜ Dependency Injection ➜ @PostConstruct ➜ Bean Ready ➜ Context Close ➜ @PreDestroy
```

---

## 🧠 Explanation

### ✅ `@PostConstruct`

* Method runs **after** Spring creates the object and injects all dependencies.
* Great for initializing logic or configuration.

### ✅ `@PreDestroy`

* Method runs **before** Spring destroys the bean (when context is closed).
* Useful for releasing resources, closing connections, etc.

---

## 📝 Output Snapshot

```
Student Component Constructor....!
Object initialization is finished....
456
Cleanup
```

---

## 📌 When to Use?

| Annotation       | When It Runs                             | Use For                                       |
| ---------------- | ---------------------------------------- | --------------------------------------------- |
| `@PostConstruct` | After constructor + dependency injection | Initial setup (e.g., logging, loading config) |
| `@PreDestroy`    | Before Spring shuts down the bean        | Cleanup (e.g., closing DB/API/resources)      |

---

## 📚 Learn More

* [Spring Lifecycle Docs](https://docs.spring.io/spring-framework/reference/core/beans/factory-nature.html#beans-factory-lifecycle-initializingbean)
* [Baeldung - Spring Init/Destroy](https://www.baeldung.com/spring-postconstruct-predestroy)

---
