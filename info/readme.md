There are two ways of writing logs-  
- One, using the Spring provided default logger implementation facilitated by 
base.xml config
- Two, using logback implementation

The default logger can be leveraged by logging implementation like log4j, 
slf4j, etc. This provides a very basic control over logging and is not very 
customizable in terms of formatting, input control, output control, etc.  
The other one provides a little more control over logging using the Logback.
This can be used in the Spring Boot project using following dependencies.
```$xslt
       <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>jul-to-slf4j</artifactId>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>log4j-over-slf4j</artifactId>
        </dependency>
```

To control and customize logs create a logback-spring.xml file in 
`/src/main/resources` 

The logs can be sent directly to the `System.out` / `System.err` or to a file.
The advantage of using a file here can be to archive the info for longer 
period of time or to use further in pipeline with ELK/EFK Stacks (Elastic 
Stack).   

**Appenders and Layouts**  
The ability to selectively enable or disable logging requests based on their 
logger is only part of the picture. Logback allows logging requests to print 
to multiple destinations. In logback speak, an output destination is called an 
appender.  

Currently, appenders exist for the console, files, remote socket 
servers, to MySQL, PostgreSQL, Oracle and other databases, JMS, and remote 
UNIX Syslog daemons.


**Customization**  
Logback provides its own set of keyword mapping called as Pattern , which is 
simply different kind of dynamic values used in logs like datetime, thread, etc.
Furthermore if user want to have custom mapping they can create using 
Conversion Rules. It is done through `ConversionName` & `ConverterClass`