resource "aws_ecr_repository" "this" {
  name                 = var.repo_name
  image_tag_mutability = "MUTABLE"
  force_delete         = true

  tags = {
    Name = var.repo_name
  }
}
