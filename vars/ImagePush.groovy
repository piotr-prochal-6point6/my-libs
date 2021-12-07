def call(String dockerRegistry, String tagVersion) {
    sh """
        export DOCKER_REGISTRY=${dockerRegistry} VERSION=${tagVersion}
        ${env.WORKSPACE}/jenkins/push_images.sh
    """
}