def call() {
    sh 'trivy image poorna818/youtube:latest > trivyimage.txt'
}
