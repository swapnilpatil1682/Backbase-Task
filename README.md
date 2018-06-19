# Backbase-Task

This simple end to end DevOps pipeline for hello world app. 
Spring boot helloworld application is created and the source code is in src directory.
Below are the instructions to run the app. 

Docker image is created and pushed to dockerhub docker.io/pswapnil1/backbaseapp. 
Dockerfile code is at root level.

Kubernetes code is in Kubernetes folder at root level.
Deployment has been created with replica set of 3. 
In services app has been exposed with Nodeport to access from outside the cluster.
To get the service first get the minikube IP and then run it with port exposed i.e. 
31317.

1) Spring boot app.

   #To run locally : 
   
   a) mvn spring-boot:run

   #To create a jar :
   
   b) mvn package

   #To run the created jar 
   
   c) java -jar target/spring-app-1.0-SNAPSHOT.jar


2) Docker Image. 

   #To build the docker image from dockerfile 
   
   a) docker build -t pswapnil1/backbaseapp
  
   #To run the created docker image 
   
   b) docker run -it -p 8089/8080 pswapnil1/backbaseapp

   #To pull the image from docker hub 
   
   c) docker pull pswapnil1/backbaseapp

3) Kubernetes
   
   #To get the service  
   
   a) kubectl get service   

   #To get the pods of app  
   
   b) kubectl get pods -n=backbase
 
   #To get the service of app 
   
   c) kubectl get svc -n=backbase


4) Jenkins 

   #To get the service url
   
   d) minikube service jenkins —url
   
   #To get the initialAdminPassword for jenkins installation

   e)kubectl exec jenkins-6567d974f4-k5wwq cat /var/jenkins_home/secrets/initialAdminPassword

   #To open the service
   
   f) minikube service jenkins




To run the above app. 

1) First clone the repository. 
2) To create JAR of spring app run a) mvn clean install and b) mvn package. Now the jar will get created in target folder.
3) Now create the docker image (Dockerfile is at root directory). Run docker build -t pswapnil1/backbaseapp . 
4) (Optional) You can push the created image in your own docker hub. But you can pull from my repo with command docker pull pswapnil1/backbaseapp
5) Now start the minikube cluster with command minikube start.
6) Now for kubernetes first create namespace and the deployment and services. 
   a) kubectl apply -f namespace.yaml
   Check if namespace with name backbase is created by running kubectl get namespaces. 
   b) kubectl apply -f deployment.yaml
   Check if deployment has been created by running kubectl get pods -n=backbase.
   c) kubectl apply -f services.yaml
   Check if service has been created by running kubectl get svc -n=backbase.
   d) kubectl apply -f jenkins.yaml 
   With above command you ll deploy jenkins in your k8's cluster. You can check if jenkins is running by 
   kubectl get svc. If it is running you can access it by running minikube service jenkins
   e) Now run your service. First check IP of your minikube as we have used nodeport the service will run on IP of minikube 
   with port we forwared in service i.e. 31317 
   e.g. http://192.168.99.100:31317/
   
   
   
   
