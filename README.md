# AsyncQueryResultsSpringData
Implementation of Async query result in Spring data JPA using a demo project
DB - demojpaquery

user, password = root;

CompletableFuture<Person> completableFuture = peopleManagementService.findByEmail("maya.m2018@gmail.com");
Person person = completableFuture.get(20, TimeUnit.SECONDS);
