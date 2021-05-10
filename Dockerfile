# 获取公有仓库镜像 jboss/base-jdk:8 此镜像看了下是基于openjdk
FROM jboss/base-jdk:8
# 配置部分内容 暂时只用到JBOSS_HOME
ENV WILDFLY_VERSION 23.0.0.Final
ENV WILDFLY_SHA1 b06fab856140226dc499855f324c3e134517455f
ENV JBOSS_HOME /opt/jboss/wildfly
# 此命令估计使用容器root用户
USER root
# Add the WildFly distribution to /opt, and make wildfly the owner of the extracted tar content
# Make sure the distribution is available from a well-known place
#run命令 切换到容器默认$HOME路径下 新进opt/jboss/wildfly文件夹
RUN cd $HOME \
	&& mkdir -p opt/jboss/wildfly
#copy命令 将H:\docker\jboss-7.1-ZJGCS文件夹内的内容复制到 /opt/jboss/wildfly/
COPY TestJboss/ /opt/jboss/wildfly/
#run命令 切换到容器默认$HOME路径下 设置文件夹权限
RUN cd $HOME \
	&& chown -R jboss:0 ${JBOSS_HOME} \
	&& chmod -R g+rw ${JBOSS_HOME}
# Ensure signals are forwarded to the JVM process correctly for graceful shutdown
# 暂不不理解此命令
ENV LAUNCH_JBOSS_IN_BACKGROUND true
# 此命令估计使用容器jboss用户
USER jboss
# Expose the ports we're interested in
#暴露8888端口 可能不需要此命令
EXPOSE 9993

# Set the default command to run on boot
# This will boot WildFly in the standalone mode and bind to all interface
# 运行jboss 配置参数暂不理解
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0"]