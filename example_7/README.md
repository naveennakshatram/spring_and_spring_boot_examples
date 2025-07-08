# Spring Bean Initialization: Eager vs Lazy

This project demonstrates the difference between **eager** and **lazy initialization** of Spring components using annotations like `@Component`, `@Configuration`, and `@Lazy`.

---

## 📘 Example 1: Eager Initialization (Default Behavior)

### 📁 Package: `com.example.example_seven`

### 🔸 Description

In this example, Spring initializes the `Student` and `Marks` components **immediately** when the application context is created.

### 🔸 Code Highlights

```java
@Component
class Student {
    Marks marks;

    public Student(Marks marks) {
        System.out.println("Component Initialized....!");
        this.marks = marks;
    }
}
```

- `Student` depends on `Marks`
- No `@Lazy` annotation is used
- Output will show **constructor message during context creation**

### 🔸 Output

```
Component Initialized....!
Component Initialization Finished....!
```

Spring initializes the `Student` bean **eagerly**, even though it's never accessed.

---

## 📗 Example 2: Lazy Initialization

### 📁 Package: `com.example.example_seven.lazy_example`

### 🔸 Description

In this example, the `Student` bean is marked with `@Lazy`, meaning it won’t be created until it's actually requested from the context.

### 🔸 Code Highlights

```java
@Component
@Lazy
class Student {
    Marks marks;

    public Student(Marks marks) {
        System.out.println("Component Initialized....!");
        this.marks = marks;
    }
}
```

- `@Lazy` tells Spring to defer initialization
- Bean is only created when `context.getBean(Student.class)` is called

### 🔸 Output

```
Component Initialization Finished....!
Component Initialized....!
```

Notice how the bean is only initialized **after the context is created**, when it is explicitly requested.

---

## 🔍 Summary

| Behavior             | Without `@Lazy`      | With `@Lazy`            |
|----------------------|----------------------|--------------------------|
| When initialized     | During context startup | On first access via `getBean()` |
| Use case             | Faster access at runtime | Saves memory on startup |

---

## ✅ Key Annotations

| Annotation      | Description                                  |
|-----------------|----------------------------------------------|
| `@Component`    | Marks a class as a Spring-managed bean       |
| `@Lazy`         | Delays bean initialization until needed      |
| `@Configuration`| Declares configuration class for Spring      |
| `@ComponentScan`| Tells Spring to scan for component classes   |

---

## 🧪 How to Run

1. Create a Spring-enabled project.
2. Copy each example into separate packages.
3. Run each main class individually to observe the difference in initialization behavior.

---