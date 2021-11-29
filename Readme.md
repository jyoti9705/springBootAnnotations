1. @SpringBootApplications
    1. Main class of the application in SpringBoot is marked with SpringBootApplication annotation
    2. Above annotation comprises 3 different annotation
        1. @EnableAutoConfiguration
        2. @ComponentScan
        3. @Configuration
    3. SpringBoot autoconfigures the application with all the dependencies required by the project
    4. Component scans all the base packages or the package provided to generate Spring Beans
    5. Configuration class is used to declare beans for the application
    6. @Configuration
        1. Class is the source of all the beans definitions
    7. @Autowired
        1. Autowired's annotation is used to inject the dependency or beans specified in the configuration class.
        2. Beans created against the class is stored in Application context i.e. IOC Container
        3. If we are using autowired annotation, and we have not specified the bean in the configuration class , we can
           make springboot detect the class for us by adding @Component annotation on the top of the class
    8. @Component
        1. Class annotated with @Component annotation is automatically detected by SpringBoot to create beans for the
           class with help of @ComponentScan present in @SpringBootApplication
        2. Object and lifecycle for object for these classes are managed by Spring
        3. Component itself has many annotations
            1. @Controller
            2. @Repository
            3. @Service
            4. these are more specific components i.e. they are components, but they are specific to provide services
               related to controller or service or repository
    9. If 2 beans of class are detected we can either make one of them @Primary annotation to make one bean primary, or
       we can make use of @Qualifier annotation and pass the bean name
    10. @Lazy
        1. Lazy annotation is used when we do not want to use class much and the object is created or invoked only when
           required
        2. As per injection class bean is created and not always
    11. @GetMapping
        1. Accept gets request and maps to the function
        2. You also return jsp files or views from the method
    12. @ResponseBody
        1. Tells controller that return type of method is already serialized to json and is packed as http response and
           returned to the caller
        2. It is used when we do not want to return view files from method
    13. @RequestBody
        1. When we want to accept model as input we will make use of RequestBody
        2. RequestBody will automatically deserialize the data coming to the model class
    14. @RestController
        1. If we do not want to use @ResponseBody we can simply make use of @RestController in place of @Controller
    15. @PathVariable
        1. It is used to take data from the URL
    16. @RequestParam
        1. It is used to take data incoming from URL as a query 
        2. 
   