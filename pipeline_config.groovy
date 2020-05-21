application_environments{
  dev{
    short_name = "dev"
    long_name = "Development"
    helm_chart_branch = "new-repos-val"
  }
}

libraries{
  sdp{
    images{
      registry = "https://docker.pkg.github.com"
      repository = "boozallen/sdp-images"
      cred = "github"
    }
  }
  github
  docker{
    merge = true
    registry = "localhost:5000"
    repo_path_prefix = "sample-app"
    cred = "local-registry"
  }
}

steps{
  deploy_to{
    stage = "Deploy"
    image = "maven"
    script = "echo 'deploy to'"
  }
}
