import Footer from '~/layouts/components/Footer';
import Header from '~/layouts/components/Header';

function DefaultLayout({ children }) {
    return (
        <div className="wrapper">
            <div className="header">
                <div className="flex h-[60px] items-center shadow-md">
                    <Header />
                </div>
            </div>
            <div className="mb-auto h-full ">{children}</div>
            <div className="mt-10 h-full ">
                <Footer />
            </div>
        </div>
    );
}

export default DefaultLayout;
