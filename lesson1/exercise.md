# 📘 Exercise: Understanding Spring Beans and Dependency Injection

Your task is to connect two classes using Spring’s **`@Component`** and **`@Autowired`**. Follow these steps exactly.

## 1. In `HelloComponent.java`

- Mark the class as a Spring Bean using **`@Component`**.
- Add a method `public String getMessage()` that returns a greeting string "Hello from HelloComponent!".

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
