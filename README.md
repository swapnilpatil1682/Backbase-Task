# Backbase-Task

This simple end to end DevOps pipeline for hello world app. 

1) Spring boot app.

To run locally : 
mvn spring-boot:run

To create a jar :
mvn package

To run the created jar 
java -jar target/spring-app-1.0-SNAPSHOT.jar


2) Docker Image. 

Dockerfile is inside a Docker folder at root level.

3) Kubernetes



kubectl get service


minikube service jenkins

minikube service jenkins —url


kubectl get pods


kubectl exec jenkins-6567d974f4-k5wwq cat /var/jenkins_home/secrets/initialAdminPassword

Jenkins admin username and password 
 admin 
 admin



