application_environments{
  dev{
    short_name = "dev"
    long_name = "Development"
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
  github{
    source_type = "github_enterprise"
  }
  gradle
}
