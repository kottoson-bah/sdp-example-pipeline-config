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
    registry = "docker-registry-default.apps.okd.kottoson.net"
    repo_path_prefix = "sample-app"
    cred = "openshift-sample-app-tiller"
  }
}

//steps{
//  deploy_to{
//    stage = "Deploy"
//    image = "maven"
//    script = "echo 'deploy to'"
//  }
//}
