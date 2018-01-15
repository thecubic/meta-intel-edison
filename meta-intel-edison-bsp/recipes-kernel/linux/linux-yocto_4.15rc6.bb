LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

KBRANCH ?= "standard/base"

require recipes-kernel/linux/linux-yocto.inc

PV = "4.15-rc6"

SRC_URI = "git://github.com/andy-shev/linux.git;protocol=https;branch=eds \
        file://ftdi_sio.cfg \
        file://smsc95xx.cfg \
        file://bt_more.cfg \
        file://i2c_chardev.cfg \
        file://usb_phy.cfg \
        file://usb_dwc3.cfg \
        file://g_multi.cfg \
        file://shiny.cfg \
        "
SRC_URI[md5sum] = "908e1f405739bb330715ecf71b396998"
SRC_URI[sha256sum] = "7db5e45e603b9769597b9022ec9cc76688f78d8159bbe53bb061058b5eefc445"

SRCREV = "417835b0c7d072649b2de13ba9dfe6eb5f3b8775"
SRCREV = "0a5698e8c1bd960268cbd610288dacca2d220790"
SRCREV = "a7d31bb421d46ee1b7f43b113dd1f51e91ccb189"

LINUX_VERSION ?= "4.14"
LINUX_VERSION_EXTENSION = "-github-andy-shev-${LINUX_KERNEL_TYPE}"

COMPATIBLE_MACHINE = "edison"
