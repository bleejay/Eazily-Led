# Eazily-LED

## Project Details

This is the creation of a simple website built using spring. The contents of this site include:
  * Various view pages
  * Simple email sender
  * Dynamically modelled pages (using thymeleaf)

## Setup

In order to allow this application to run fully, you will need to create a mailSenderBean.xml file in src/main/resources which has the following format:

    <?xml version = "1.0" encoding = "UTF-8"?>
    <beans xmlns = "http://www.springframework.org/schema/beans"
       xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation = "http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

        <bean id="mailSender" class="org.springframework.mail.javamail.JavaMailSenderImpl">
            <property name="host" value="smtp.gmail.com" />
            <property name="port" value="587" />
            <property name="username" value="<USERNAME>" />
            <property name="password" value="<PASSWORD>" />

            <property name="javaMailProperties">
                <props>
                    <prop key="mail.smtp.auth">true</prop>
                    <prop key="mail.smtp.starttls.enable">true</prop>
                    <prop key="mail.smtp.ssl.trust">smtp.gmail.com</prop>
                </props>
            </property>

        </bean>
        <bean id="SimpleEmailSender" class="com.jlb.model.SimpleEmailSender">
            <property name="mailSender" ref="mailSender" />
        </bean>

    </beans>

Once the bean file has been created you will also need to download and setup the maven cli, which can be found [here](https://maven.apache.org/download.cgi)

After this in the command line run:

`mvn clean
mvn package spring-boot:repackage`

and then execute the jar file created in target:

`java -jar target/FILENAME.JAR`

The site will now be running on port 8080, and can be accessed on local host.

## Authors

Jason Blee
Daniel Blake
