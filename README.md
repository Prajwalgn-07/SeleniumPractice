Automating adding to cart and create account in an ecommerce website

This project will give a glimpse of how adding items to cart and checking out, creating account can be automated. I have used Selenium,
and this is a maven project so there is no need to download necessary jar files, we can just add the dependency in the pom file, and the
code was getting refactored based on the feedback by the mentor, the changes can be seen in the history of commits


How to use
1. Clone the project to your local system
2. Open the project in IntelliJ
3. Right click on your project name and click on add framework support and choose maven
4. Go to the pom file and add the following dependencies

SeleniumJava dependency(don't copy this sentence):
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>

WebdriveManager(don't copy this sentence):
<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>4.4.3</version>
</dependency>

json-simple(don't copy this sentence):
<dependency>  
    <groupId>com.googlecode.json-simple</groupId>  
    <artifactId>json-simple</artifactId>  
    <version>1.1</version>  
  </dependency>
  
5. Change the paths of json file and Screenshot package according to your system path wherever mentioned 
6. Go to testscripts package and run AddingToCartTest and Create AccountTest one after the other
