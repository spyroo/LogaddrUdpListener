#LogaddrUdpListener


##What
This project exists to provide a platform for TF2 casters to get an advanced feed showing important moments before they happen on the STV. This allows casters to catch important moments without hassle.

##Structure(For devs)
Uses a factory design pattern, where _Factories_ create objects and _Warehouses_ store objects. _UdpListener_ creates _UdpConnections_ . It is able to be multithreaded(i think)

A _UdpConnection_ has a _LogLineWarehouse_ where it stores _LogLines_ that have a _PlayerWarehouse_ to store _Players_
_UdpConnections_ are stored in a _UdpConnectionWarehouse_ inside of _UdpListener_
