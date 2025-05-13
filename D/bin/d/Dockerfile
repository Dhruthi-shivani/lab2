FROM openjdk
WORKDIR /app
COPY mul.java src/d/mul.java
RUN javac -d classes src/d/mul.java
CMD ["java","-cp","classes","d.mul"]