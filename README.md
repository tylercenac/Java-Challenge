# cic2020interns_wk3 - Implementing COVID-19 API
## Java Mini-Challenge
https://api.covid19api.com/

## Scenario
You are a recently hired full stack developer given the task of completing an API development user story started by a former colleague. You must complete the requirements of the user story and test to ensure all new and existing funtionality of the API.

## User Story 
 > As a React Native COVID-19 mobile developer, I want to use an API that I can receive a list of countries where I have provided the countries and whether they are compared by "Total Confirmed", "Total Deaths", or "Total Recovered" so that I can display the list in the mobile application.

### Sample UI
![Sample User Interface](https://media.github.ibm.com/user/203313/files/8ecc4a00-bb67-11ea-944a-17d4b83d1486)

### Developer's Notes
> "Hey, I pretty much finished everything except the comparison API. Pretty easy and I already created the payload. You just need to implement the **getComparison** method in **Covid19ApiServiceImpl** to return a the list of countries sorted by the CompareBy enum."

> "Oh yeah, I left my Postman collection for you to use and we tried using **Lombok** so they may be a bug or two."

> "Good luck! J!"

## Project Directory Structure 
```
C:.
+---java
¦   +---com
¦       +---ibm
¦           +---br
¦               +---cic
¦                   +---internship
¦                       +---covid             -- root package
¦                           +---api           -- for endpoints  
¦                           ¦   +---payload   -- for request payloads
¦                           +---model         -- for data models
¦                           +---service       -- for business functionality
+---resources                                 -- property and yaml files
```

## Project Files
```
C:.
+---java
¦   +---com
¦       +---ibm
¦           +---br
¦               +---cic
¦                   +---internship
¦                       +---covid
¦                           ¦   Covid19Application.java           -- starting point of application
¦                           ¦
¦                           +---api
¦                           ¦   ¦   ComparisonController.java     -- rest controller for comparison endpoint
¦                           ¦   ¦   SummaryController.java        -- rest controller for summary endpoint
¦                           ¦   ¦
¦                           ¦   +---payload
¦                           ¦           ComparisonPayload.java    -- request payload for comparison endpoint
¦                           ¦
¦                           +---model
¦                           ¦       CompareBy.java                -- enum of comparison by fields
¦                           ¦       Comparison.java               -- data model
¦                           ¦       Country.java                  -- data model
¦                           ¦       Global.java                   -- data model
¦                           ¦       Summary.java                  -- data model
¦                           ¦
¦                           +---service
¦                                   Covid19ApiService.java        -- service interface
¦                                   Covid19ApiServiceImpl.java    -- service implementation
¦
+---resources
    ¦   application.properties                                    -- application properties
```

## Libraries and Spring Boot Annotations
**@Data** - (Lombok) shortcut for getters and setters

**@SpringBootApplication** - indicates the configuration class for your Spring Boot applicatoion 

**@ComponentScan** - for scanning all classes annotated with the stereotype annotations @Component, @Controller, @Service, and @Repository

**@RestController** - for RESTful web services

**@RequestMapping** - mapping an HTTP request to a class or method

**@Autowired** - dependency injection

**@ApiOperation** - for Swagger

**@CrossOrigin** - cross-origin resource sharing

**@GetMapping** - shortcut for @RequestMapping(method = RequestMethod.GET)

**@PostMapping** - shortcut for @RequestMapping(method = RequestMethod.POST)

**@ControllerAdvice** -  for handling all exceptions

**@JsonProperty** - used to mark non-standard getter/setter method to be used with respect to json property

**@SerializedName** - indicates the Java property should be serialized to JSON a specific name

**@Service** - used with classes that provide some business functionalities

**@Value** - used to inject values into variables and method arguments
