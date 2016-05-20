# Dockerfile for rundeck

FROM debian:jessie

MAINTAINER Rémi Jouannet "remijouannet@gmail.com"

ENV http_proxy http://proxy.neurones.fr:8080/
ENV https_proxy http://proxy.neurones.fr:8080/

RUN apt-get update
RUN apt-get install -y bash ca-certificates openjdk-7-jre-headless
RUN apt-get install -y openssh-client pwgen curl git vim uuid-runtime

ADD http://dl.bintray.com/rundeck/rundeck-deb/rundeck-2.6.7-1-GA.deb /tmp/rundeck.deb
COPY . /app
WORKDIR /app
RUN useradd -d /var/lib/rundeck -s /bin/false rundeck
RUN chmod u+x ./run.sh

EXPOSE 4443

CMD ./run.sh
