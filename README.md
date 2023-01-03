
## Navigate to this project's directory
- /Users/brendan/Desktop/cicd.docker.githubactionsdemo

`docker build -t <container_name_you_provide_can_be_anything> .`

docker build -t hackerman1337/springboot-cicd-githubaction-docker-example .

`docker run -p 8080:8080 <container_name_you_provided>`

docker run -p 8080:8080 hackerman1337/springboot-cicd-githubaction-docker-example