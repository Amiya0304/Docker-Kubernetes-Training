

resource "aws_instance" "example" {
  ami           = var.ami 
  instance_type = var.instance_type

  tags = {
    Name = "ExampleInstance"
  }
}

resource "aws_s3_bucket" "example_bucket" {
  bucket = "example-bucket-terraform-2024"
  #acl    = "private"

  tags = {
    Name        = "ExampleBucket"
    Environment = "Dev"
  }
}