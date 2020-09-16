FROM ubuntu:16.04
WORKDIR /data/app
COPY lib/ lib/
COPY dep_lib/ dep_lib/
COPY tmp_lib/ tmp_lib/
COPY conf/ conf/
COPY bin/ bin/
EXPOSE 6660
EXPOSE 6677
RUN cd bin/
ENTRYPOINT ["sh", "-c", "./ht-sms-start.sh"]