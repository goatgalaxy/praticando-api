logs:
	heroku logs --tail
deploy:
	heroku push heroku master
test:
	mvn test