<p align="center">
  <a href="https://medium.com/trendyol-tech/how-to-write-a-spring-boot-library-project-7064e831b63b">
    <img src="https://cdn-images-1.medium.com/max/1600/1*vK3PHmkxImZ0dnuzJU0SdQ.jpeg" alt="Logo" width="700" height="500">
  </a>
  
  <h3 align="center">Marvelous Api Client</h3>
  <p align="center">
    An example project demonstrating of writing a Spring Boot library project
  </p>
</p>

## About The Project

In this project, we're going to create an api-client library, which will include a feign client, the request/response models, and a proxy. If we don't create this library, you can think of adding these to the applications every time you need to use this client:
* The URL and feign configurations to the application properties,
* The feign client interface,
* A custom decoder if needed,
* A custom exception if needed,
* The request/response models,
* A proxy class to handle exceptions and process the output.

We can clearly see how much of a burden it is. After completing the library, we only need to add two things to the applications:
* The library itself to the dependency list,
* Our custom annotation to the main class for enabling the api-client.

## Details

For details please visit the Medium article I wrote about this.

<br>
<a href="https://medium.com/trendyol-tech/how-to-write-a-spring-boot-library-project-7064e831b63b">
  <img src="/medium-article.jpg" alt="How to Write a Spring Boot Library Project?" width="454" height="300">
</a>
