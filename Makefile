build:
	./gradlew build

# imageをビルドしてコンテナを起動
up:
	docker compose up --build

# コンテナの停止・削除
down:
	docker compose down

back:
	make build
	make up
