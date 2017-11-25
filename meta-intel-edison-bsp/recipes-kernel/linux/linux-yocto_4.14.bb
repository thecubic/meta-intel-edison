LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

KBRANCH ?= "standard/base"

require recipes-kernel/linux/linux-yocto.inc

PV = "4.14.0"

SRC_URI = "git://github.com/thecubic/linux.git;protocol=https;branch=eds-4.14 \
        file://ftdi_sio.cfg \
        file://smsc95xx.cfg \
        file://bt_more.cfg \
        file://i2c_chardev.cfg \
        file://usb_phy.cfg \
        file://usb_dwc3.cfg \
        file://g_multi.cfg \
        file://shiny.cfg \
        "

SRCREV = "417835b0c7d072649b2de13ba9dfe6eb5f3b8775"

LINUX_VERSION ?= "4.14"
LINUX_VERSION_EXTENSION = "-edison-${LINUX_KERNEL_TYPE}"

COMPATIBLE_MACHINE = "edison"
