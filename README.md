## SonarQube

### LCO_Probe
```
mvn clean verify sonar:sonar \
  -Dsonar.projectKey=Lansa-Connect \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=sqp_9f2fb34f847b384beef26ef5dfb8d5f81d5e9278
```