module "ecr" {
  source    = "./modules/ecr"
  repo_name = var.ecr_repo_name
}

module "eks" {
  source       = "./modules/eks"
  cluster_name = var.cluster_name
}
