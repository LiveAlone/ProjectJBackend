/*
 * This file was generated by the Gradle 'init' task.
 */
plugins {
    id("org.yqj.source.java-spring-conventions")
}

publishing {
    publications {
        getByName<MavenPublication>("maven") {
            pom {
                description.set("org yqj source spring info")
            }
        }
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    // database
    implementation("com.mysql:mysql-connector-j")
    implementation("com.baomidou:mybatis-plus-spring-boot3-starter:3.5.6")
    implementation("com.baomidou:mybatis-plus-extension:3.5.6")

    implementation("org.redisson:redisson-spring-boot-starter:3.28.0")
}