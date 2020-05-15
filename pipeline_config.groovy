application_environments{
  dev{
    short_name = "dev"
    long_name = "Development"
  }
}

libraries{
//  sdp{
//    images{
//      registry = "https://docker.pkg.github.com"
//      repository = "boozallen/sdp-images"
//      cred = "github"
//    }
//  }
//  github
  docker{
    merge = true
    registry = "docker-registry-default.apps.okd.kottoson.net"
    repo_path_prefix = "sample-app"
    cred = "openshift-sample-app-tiller"
  }
  openshift{
    url = "master.okd.kottoson.net:8443"
    helm_configuration_repository = "https://github.com/kottoson-bah/sdp-example-helm-config.git"
    helm_configuration_repository_credential = "github"
    tiller_namespace = "sample-app-tiller"
    tiller_credential = "openshift-sample-app-tiller"
  }
}
