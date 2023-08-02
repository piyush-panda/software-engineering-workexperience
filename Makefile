# MAKE VARS ######################################################

INVERSE_MATCHER ?= false

# RECIPES #############################################################

# USAGE:
#   make compile
compile:
	@echo "Building project"
	./gradlew build -x test --info

# USAGE:
#   make test
#   make INVERSE_MATCHER=true test
test:
	@echo "Running All Project Tests"
	./gradlew -DinverseMatcher=$(INVERSE_MATCHER) test

# USAGE:
#   make test-challenge-1
#   make INVERSE_MATCHER=true test-challenge-2
#   for i in {1..5}; do make INVERSE_MATCHER=true test-challenge-$i; done
test-challenge-%:
	@echo $* | grep -E '^[0-9]+$$' >/dev/null || { echo "Invalid challenge number: $*"; exit 1; }
	@echo "Running Tests For Challenge: $*"
	./gradlew -DinverseMatcher=$(INVERSE_MATCHER) -DchallengeNumber=$* test --tests "io.github.u.ways.Challenge$*Test" --quiet

# USAGE:
#   make test-coverage
test-coverage:
	@echo "Generates the test coverage report"
	./gradlew jacocoTestReport