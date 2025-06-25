# 📘 Lesson 01: Spring Beans, `@Component`, `@RestController`, `@RequestMapping` and `@Autowired`

## 🧠 What You Will Learn

In this lesson, you’ll understand:

✅ What is a Spring Bean  
✅ How to create one using `@Component`  
✅ How to use `@Autowired` to connect two classes  
✅ How dependency injection works in Spring Boot  
✅ What `@RestController` means  
✅ What `@RequestMapping` does  

---

## 📝 Introduction: What is a Spring Bean?

A **Spring Bean** is just a Java object that is managed by the **Spring Framework**.

Spring keeps track of certain objects and automatically **creates**, **shares**, and **connects** them for you. These managed objects are called *beans*.

> Imagine asking Spring:  
> *“Hey Spring, I need this class — can you give it to me?”*  
> Spring replies:  
> *“Sure! I already created it, and I’ll inject it wherever you need.”*

---

## 🧱 `@Component`: Mark a Class as a Spring Bean

Use `@Component` to tell Spring:

> “Please manage this class as a bean.”

```java

@Component
public class HelloComponent {
    public String sayHello() {
        return "Hello from HelloComponent!";
    }
}

```
When Spring starts, it finds all classes annotated with `@Component` and keeps them ready to use.

---

## 🤝 `@Autowired`: Ask Spring for a Bean

Use `@Autowired` to tell Spring:

> “Give me the bean for this class.”

```java
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloComponent helloComponent;

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return helloComponent.sayHello();
    }
}
```
When someone accesses `/hello`, Spring injects an instance of `HelloComponent` and calls its method.

---

## 🌐 `@RestController`: Create a Web Endpoint

Use `@RestController` to tell Spring:

> “This class handles web requests and returns data (not HTML).”

A `@RestController` combines:
- `@Controller` (makes it a Spring MVC controller)
- `@ResponseBody` (returns data like JSON or text, not views)

So if your method returns `"Hello"` — the browser will **display it directly**, not look for an HTML file.

---

## 🔗 `@RequestMapping`: Handle HTTP Routes

Use `@RequestMapping` to tell Spring:

> “When someone visits this URL, run this method.”

### Example:

```java
@RequestMapping("/hello")
public String sayHello() {
    return "Hi!";
}
```

Now visiting `http://localhost:8080/hello` will run the method and return `"Hi!"` in the browser.

---

## 📌 Summary

| Annotation         | Meaning                                                       |
|--------------------|---------------------------------------------------------------|
| `@Component`       | Register the class as a Spring Bean                           |
| `@Autowired`       | Inject an existing bean into this class                       |
| `@RestController`  | A controller that returns data (usually JSON or plain text)   |
| `@RequestMapping`  | Connects a URL path (like `/hello`) to a method               |
