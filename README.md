# AsyncQueryResultsSpringData
Implementation of Async query result in Spring data JPA using a demo project
DB - demojpaquery

user, password = root;

CompletableFuture<Person> completableFuture = peopleManagementService.findByEmail("maya.m2018@gmail.com");
Person person = completableFuture.get(20, TimeUnit.SECONDS);
  
  Repository queries can be executed asynchronously using Spring asynchronous method execution capability.
  This means the method will return immediately upon invocation and the actual query execution will occur in a task that has been submitted to a Spring TaskExecutor. 
