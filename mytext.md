# 跨域登录流程

xxl-sso-server:用户输入username和password 通过数据库或redis进行比对

==> 比对不通过,重定向回登录界面;比对通过,如果redis没有该用户信息缓存 添加到redis

==> 将用户信息放入cookie 返回

==> 访问其他服务时,携带cookie信息 

==> 解析cookie 与redis中的用户信息比对 如果一致则