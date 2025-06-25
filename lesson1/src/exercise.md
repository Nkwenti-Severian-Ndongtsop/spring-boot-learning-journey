# 📘 Exercise: Understanding Spring Beans and Dependency Injection

Your task is to connect two classes using Spring’s **`@Component`** and **`@Autowired`**. Follow these steps exactly.

## 1. In `HelloComponent.java`

- Mark the class as a Spring Bean using **`@Component`**.
- Add a method `public String getMessage()` that returns a string "My First Spring-Boot Application!".

## 2. In `HelloController.java`

- Mark the class as a **`@RestController`**.
- Inject `HelloComponent` using **`@Autowired`**.
- Create a method mapped to `/hello` using **`@RequestMapping`**.
- Return the result of `helloComponent.getMessage()`.

---

### ✅ Example Expected Result

When you run the project and visit **`http://localhost:8000/hello`**, you should see:

```csharp
Hello from HelloComponent!
```

### 🚀 How to Run Maven Tests

To run your Maven tests, navigate to the root directory of your project in your terminal (where your `pom.xml` file is located) and execute the appropriate command for your operating system:

**For Linux/macOS:**

```bash
./mvnw test
```

**For Windows:**

```bash
mvnw.cmd test
```