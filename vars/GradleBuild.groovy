def call(String mainWorkspace) {
    catchError {
        sh "cd ${mainWorkspace} && ./gradlew clean build -x test integrationTest e2eTest"
    }
    sh "./gradlew bootJar docker"
}