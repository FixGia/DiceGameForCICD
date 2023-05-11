# Utilisez l'image de base avec Java 17
FROM openjdk:17-jdk-buster

# Définissez le répertoire de travail dans le conteneur
WORKDIR /app

# Copiez les fichiers Gradle nécessaires dans le conteneur
COPY build.gradle .
COPY settings.gradle .
COPY gradlew .
COPY gradle ./gradle

# Copiez le reste du code source de l'application dans le conteneur
COPY src ./src

# Exécutez la construction Gradle pour télécharger les dépendances et compiler l'application
RUN ./gradlew build --no-daemon

# Exposez le port sur lequel l'application Spring Boot écoute (le cas échéant)
EXPOSE 8080

# Démarrez l'application Spring Boot lors du démarrage du conteneur
ENTRYPOINT ["java", "-jar", "build/libs/DiceGame-0.0.1-SNAPSHOT.jar"]
