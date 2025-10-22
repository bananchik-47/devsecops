# Используем официальный образ с Java
FROM openjdk:21-jdk-slim

# Указываем рабочую директорию внутри контейнера
WORKDIR /app

# Копируем весь проект внутрь контейнера
COPY . /app

# Компилируем код
RUN javac src/main.java
CMD ["java", "src/main"]
