import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChar";
import Footer from "components/Footer";
import NavBar from "components/Navbar";

const Dashboard = () => {
    return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Dashboard </h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso (%)</h5>
            <BarChart />
          </div>

          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Todas as vendas</h5>
            <DonutChart />
          </div>
        </div>

        <div className="py-3">
          <h3 className="text-primary">Todas as vendas</h3>
        </div>

        <DataTable />
      </div>
      <Footer />
    </>
    );
}

export default Dashboard;