## $1 hace referencia al parametro que se envia desde la consola al ejecutar el script ejemplo ./runTests.sh "smoke"

mvn clean test -Dgroups=$1

open target/cucumber-html-reports/overview-features.html