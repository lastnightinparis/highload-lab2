set -eo pipefail

modules=(eureka-server config-server spring-gateway order-service)

for module in "${modules[@]}"; do
  docker build -t "highload-lab2/${module}:latest" ${module}
done
